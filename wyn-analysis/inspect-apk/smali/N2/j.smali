.class public final LN2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/x;
.implements LY2/w;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:I

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LT5/z;I)V
    .locals 4

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN2/j;->e:Ljava/lang/Object;

    .line 246
    new-instance p1, LJ5/y;

    const/4 v0, 0x5

    new-array v1, v0, [B

    const/4 v2, 0x6

    const/4 v3, 0x0

    .line 247
    invoke-direct {p1, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 248
    iput-object p1, p0, LN2/j;->c:Ljava/lang/Object;

    .line 249
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LN2/j;->d:Ljava/lang/Object;

    .line 250
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LN2/j;->a:Ljava/lang/Object;

    .line 251
    iput p2, p0, LN2/j;->b:I

    return-void
.end method

.method public constructor <init>(LX0/q;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, LN2/j;->e:Ljava/lang/Object;

    .line 12
    iput-object v1, v0, LN2/j;->a:Ljava/lang/Object;

    .line 13
    iget-object v2, v1, LX0/q;->a:Landroid/content/Context;

    iput-object v2, v0, LN2/j;->c:Ljava/lang/Object;

    .line 14
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_0

    .line 15
    iget-object v3, v1, LX0/q;->B:Ljava/lang/String;

    invoke-static {v2, v3}, LX0/G;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    iput-object v3, v0, LN2/j;->d:Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_0
    new-instance v3, Landroid/app/Notification$Builder;

    iget-object v5, v1, LX0/q;->a:Landroid/content/Context;

    invoke-direct {v3, v5}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, LN2/j;->d:Ljava/lang/Object;

    .line 17
    :goto_0
    iget-object v3, v1, LX0/q;->G:Landroid/app/Notification;

    .line 18
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-wide v6, v3, Landroid/app/Notification;->when:J

    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v3, Landroid/app/Notification;->icon:I

    iget v7, v3, Landroid/app/Notification;->iconLevel:I

    .line 19
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 20
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v3, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v7, 0x0

    .line 21
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v3, Landroid/app/Notification;->vibrate:[J

    .line 22
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v3, Landroid/app/Notification;->ledARGB:I

    iget v8, v3, Landroid/app/Notification;->ledOnMS:I

    iget v9, v3, Landroid/app/Notification;->ledOffMS:I

    .line 23
    invoke-virtual {v5, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v3, Landroid/app/Notification;->flags:I

    const/4 v8, 0x2

    and-int/2addr v6, v8

    const/4 v10, 0x1

    if-eqz v6, :cond_1

    move v6, v10

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 24
    :goto_1
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v3, Landroid/app/Notification;->flags:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_2

    move v6, v10

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 25
    :goto_2
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v3, Landroid/app/Notification;->flags:I

    and-int/lit8 v6, v6, 0x10

    if-eqz v6, :cond_3

    move v6, v10

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    .line 26
    :goto_3
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v3, Landroid/app/Notification;->defaults:I

    .line 27
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, LX0/q;->e:Ljava/lang/CharSequence;

    .line 28
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, LX0/q;->f:Ljava/lang/CharSequence;

    .line 29
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v5

    .line 30
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, LX0/q;->g:Landroid/app/PendingIntent;

    .line 31
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v3, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 32
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget-object v6, v1, LX0/q;->h:Landroid/app/PendingIntent;

    iget v11, v3, Landroid/app/Notification;->flags:I

    and-int/lit16 v11, v11, 0x80

    if-eqz v11, :cond_4

    move v11, v10

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    .line 33
    :goto_4
    invoke-virtual {v5, v6, v11}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v1, LX0/q;->j:I

    .line 34
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v6, v1, LX0/q;->p:I

    iget v11, v1, LX0/q;->q:I

    iget-boolean v12, v1, LX0/q;->r:Z

    .line 35
    invoke-virtual {v5, v6, v11, v12}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 36
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    .line 37
    iget-object v6, v1, LX0/q;->i:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v6, :cond_5

    move-object v2, v7

    goto :goto_5

    :cond_5
    invoke-virtual {v6, v2}, Landroidx/core/graphics/drawable/IconCompat;->j(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    .line 38
    :goto_5
    invoke-virtual {v5, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 39
    iget-object v2, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v2, Landroid/app/Notification$Builder;

    iget-object v5, v1, LX0/q;->o:Ljava/lang/CharSequence;

    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 40
    iget-boolean v5, v1, LX0/q;->m:Z

    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 41
    iget v5, v1, LX0/q;->k:I

    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 42
    iget-object v2, v1, LX0/q;->n:LX0/E;

    instance-of v5, v2, LX0/v;

    if-eqz v5, :cond_11

    .line 43
    move-object v11, v2

    check-cast v11, LX0/v;

    .line 44
    iget-object v2, v11, LX0/v;->h:Landroid/app/PendingIntent;

    const v12, 0x7f08013e

    if-nez v2, :cond_6

    .line 45
    iget-object v14, v11, LX0/v;->l:Ljava/lang/Integer;

    iget-object v2, v11, LX0/v;->i:Landroid/app/PendingIntent;

    const v13, 0x7f130035

    const v15, 0x7f060043

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v16}, LX0/v;->j(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LX0/k;

    move-result-object v2

    goto :goto_6

    .line 46
    :cond_6
    iget-object v14, v11, LX0/v;->l:Ljava/lang/Integer;

    const v15, 0x7f060043

    const v13, 0x7f130034

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v16}, LX0/v;->j(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LX0/k;

    move-result-object v2

    .line 47
    :goto_6
    iget-object v5, v11, LX0/v;->g:Landroid/app/PendingIntent;

    if-nez v5, :cond_7

    move-object v5, v7

    goto :goto_a

    .line 48
    :cond_7
    iget-boolean v6, v11, LX0/v;->j:Z

    if-eqz v6, :cond_8

    const v12, 0x7f08013c

    goto :goto_7

    :cond_8
    const v12, 0x7f08013a

    :goto_7
    if-eqz v6, :cond_9

    const v6, 0x7f130033

    :goto_8
    move v13, v6

    goto :goto_9

    :cond_9
    const v6, 0x7f130032

    goto :goto_8

    .line 49
    :goto_9
    iget-object v14, v11, LX0/v;->k:Ljava/lang/Integer;

    const v15, 0x7f060042

    move-object/from16 v16, v5

    .line 50
    invoke-virtual/range {v11 .. v16}, LX0/v;->j(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LX0/k;

    move-result-object v5

    .line 51
    :goto_a
    new-instance v6, Ljava/util/ArrayList;

    const/4 v12, 0x3

    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    iget-object v2, v11, LX0/E;->b:Ljava/lang/Object;

    check-cast v2, LX0/q;

    iget-object v2, v2, LX0/q;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_e

    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v11, v8

    :cond_a
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LX0/k;

    .line 55
    iget-boolean v13, v12, LX0/k;->g:Z

    if-eqz v13, :cond_b

    .line 56
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 57
    :cond_b
    const-string v13, "key_action_priority"

    iget-object v14, v12, LX0/k;->a:Landroid/os/Bundle;

    invoke-virtual {v14, v13}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_c

    :cond_c
    if-le v11, v10, :cond_d

    .line 58
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, -0x1

    :cond_d
    :goto_c
    if-eqz v5, :cond_a

    if-ne v11, v10, :cond_a

    .line 59
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, -0x1

    goto :goto_b

    :cond_e
    move v11, v8

    :cond_f
    if-eqz v5, :cond_10

    if-lt v11, v10, :cond_10

    .line 60
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LX0/k;

    .line 62
    invoke-virtual {v0, v5}, LN2/j;->a(LX0/k;)V

    goto :goto_d

    .line 63
    :cond_11
    iget-object v2, v1, LX0/q;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LX0/k;

    .line 64
    invoke-virtual {v0, v5}, LN2/j;->a(LX0/k;)V

    goto :goto_e

    .line 65
    :cond_12
    iget-object v2, v1, LX0/q;->y:Landroid/os/Bundle;

    if-eqz v2, :cond_13

    .line 66
    iget-object v5, v0, LN2/j;->e:Ljava/lang/Object;

    check-cast v5, Landroid/os/Bundle;

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 67
    :cond_13
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-boolean v6, v1, LX0/q;->l:Z

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 69
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-boolean v6, v1, LX0/q;->u:Z

    .line 70
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 71
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-object v6, v1, LX0/q;->s:Ljava/lang/String;

    .line 72
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 73
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    .line 74
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 75
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-boolean v6, v1, LX0/q;->t:Z

    .line 76
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 77
    iget v5, v1, LX0/q;->E:I

    iput v5, v0, LN2/j;->b:I

    .line 78
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-object v6, v1, LX0/q;->x:Ljava/lang/String;

    .line 79
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 80
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget v6, v1, LX0/q;->z:I

    .line 81
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 82
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget v6, v1, LX0/q;->A:I

    .line 83
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 84
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    .line 85
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 86
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    iget-object v6, v3, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v11, v3, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 87
    invoke-virtual {v5, v6, v11}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 88
    iget-object v5, v1, LX0/q;->I:Ljava/util/ArrayList;

    iget-object v6, v1, LX0/q;->c:Ljava/util/ArrayList;

    const/16 v11, 0x1c

    if-ge v2, v11, :cond_1a

    if-nez v6, :cond_14

    move-object v2, v7

    goto :goto_11

    .line 89
    :cond_14
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-direct {v2, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_17

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LX0/Q;

    .line 91
    iget-object v14, v13, LX0/Q;->c:Ljava/lang/String;

    if-eqz v14, :cond_15

    goto :goto_10

    .line 92
    :cond_15
    iget-object v13, v13, LX0/Q;->a:Ljava/lang/CharSequence;

    if-eqz v13, :cond_16

    .line 93
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "name:"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    goto :goto_10

    .line 94
    :cond_16
    const-string v14, ""

    .line 95
    :goto_10
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_17
    :goto_11
    if-nez v2, :cond_18

    goto :goto_12

    :cond_18
    if-nez v5, :cond_19

    move-object v5, v2

    goto :goto_12

    .line 96
    :cond_19
    new-instance v12, Lx/f;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v14

    add-int/2addr v14, v13

    invoke-direct {v12, v14}, Lx/f;-><init>(I)V

    .line 97
    invoke-virtual {v12, v2}, Lx/f;->addAll(Ljava/util/Collection;)Z

    .line 98
    invoke-virtual {v12, v5}, Lx/f;->addAll(Ljava/util/Collection;)Z

    .line 99
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_1a
    :goto_12
    if-eqz v5, :cond_1b

    .line 100
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1b

    .line 101
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 102
    iget-object v12, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v12, Landroid/app/Notification$Builder;

    .line 103
    invoke-virtual {v12, v5}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_13

    .line 104
    :cond_1b
    iget-object v2, v1, LX0/q;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_26

    .line 105
    iget-object v5, v1, LX0/q;->y:Landroid/os/Bundle;

    if-nez v5, :cond_1c

    .line 106
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iput-object v5, v1, LX0/q;->y:Landroid/os/Bundle;

    .line 107
    :cond_1c
    iget-object v5, v1, LX0/q;->y:Landroid/os/Bundle;

    .line 108
    const-string v12, "android.car.EXTENSIONS"

    invoke-virtual {v5, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_1d

    .line 109
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 110
    :cond_1d
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 111
    new-instance v14, Landroid/os/Bundle;

    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    const/4 v15, 0x0

    .line 112
    :goto_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v15, v10, :cond_24

    .line 113
    invoke-static {v15}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    .line 114
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, LX0/k;

    .line 115
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 116
    invoke-virtual {v8}, LX0/k;->a()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v18

    if-eqz v18, :cond_1e

    .line 117
    invoke-virtual/range {v18 .. v18}, Landroidx/core/graphics/drawable/IconCompat;->h()I

    move-result v18

    move/from16 v9, v18

    goto :goto_15

    :cond_1e
    const/4 v9, 0x0

    :goto_15
    const-string v7, "icon"

    invoke-virtual {v11, v7, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 118
    const-string v7, "title"

    iget-object v9, v8, LX0/k;->i:Ljava/lang/CharSequence;

    invoke-virtual {v11, v7, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 119
    const-string v7, "actionIntent"

    iget-object v9, v8, LX0/k;->j:Landroid/app/PendingIntent;

    invoke-virtual {v11, v7, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 120
    iget-object v7, v8, LX0/k;->a:Landroid/os/Bundle;

    if-eqz v7, :cond_1f

    .line 121
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9, v7}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_16

    .line 122
    :cond_1f
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 123
    :goto_16
    const-string v7, "android.support.allowGeneratedReplies"

    iget-boolean v4, v8, LX0/k;->d:Z

    invoke-virtual {v9, v7, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 124
    const-string v4, "extras"

    invoke-virtual {v11, v4, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 125
    iget-object v7, v8, LX0/k;->c:[LX0/T;

    if-nez v7, :cond_20

    move-object/from16 v19, v2

    move-object/from16 v20, v6

    const/4 v2, 0x0

    goto/16 :goto_19

    .line 126
    :cond_20
    array-length v9, v7

    new-array v9, v9, [Landroid/os/Bundle;

    move-object/from16 v19, v2

    move-object/from16 v20, v6

    const/4 v2, 0x0

    .line 127
    :goto_17
    array-length v6, v7

    if-ge v2, v6, :cond_23

    .line 128
    aget-object v6, v7, v2

    move/from16 v21, v2

    .line 129
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 130
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v22, v7

    .line 131
    const-string v7, "resultKey"

    move-object/from16 v23, v9

    const-string v9, "FlutterLocalNotificationsPluginInputResult"

    invoke-virtual {v2, v7, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v7, "label"

    iget-object v9, v6, LX0/T;->a:Ljava/lang/String;

    invoke-virtual {v2, v7, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 133
    const-string v7, "choices"

    iget-object v9, v6, LX0/T;->b:[Ljava/lang/CharSequence;

    invoke-virtual {v2, v7, v9}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 134
    const-string v7, "allowFreeFormInput"

    iget-boolean v9, v6, LX0/T;->c:Z

    invoke-virtual {v2, v7, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 135
    iget-object v7, v6, LX0/T;->d:Landroid/os/Bundle;

    invoke-virtual {v2, v4, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 136
    iget-object v6, v6, LX0/T;->e:Ljava/util/HashSet;

    invoke-virtual {v6}, Ljava/util/HashSet;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_22

    .line 137
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 139
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 140
    :cond_21
    const-string v6, "allowedDataTypes"

    invoke-virtual {v2, v6, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 141
    :cond_22
    aput-object v2, v23, v21

    add-int/lit8 v2, v21, 0x1

    move-object/from16 v7, v22

    move-object/from16 v9, v23

    goto :goto_17

    :cond_23
    move-object/from16 v23, v9

    move-object/from16 v2, v23

    .line 142
    :goto_19
    const-string v4, "remoteInputs"

    invoke-virtual {v11, v4, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 143
    const-string v2, "showsUserInterface"

    iget-boolean v4, v8, LX0/k;->e:Z

    invoke-virtual {v11, v2, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 144
    const-string v2, "semanticAction"

    iget v4, v8, LX0/k;->f:I

    invoke-virtual {v11, v2, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 145
    invoke-virtual {v14, v10, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, v19

    move-object/from16 v6, v20

    const/16 v4, 0x1a

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/16 v11, 0x1c

    goto/16 :goto_14

    :cond_24
    move-object/from16 v20, v6

    .line 146
    const-string v2, "invisible_actions"

    invoke-virtual {v5, v2, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 147
    invoke-virtual {v13, v2, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 148
    iget-object v2, v1, LX0/q;->y:Landroid/os/Bundle;

    if-nez v2, :cond_25

    .line 149
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v1, LX0/q;->y:Landroid/os/Bundle;

    .line 150
    :cond_25
    iget-object v2, v1, LX0/q;->y:Landroid/os/Bundle;

    .line 151
    invoke-virtual {v2, v12, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 152
    iget-object v2, v0, LN2/j;->e:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v2, v12, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1a

    :cond_26
    move-object/from16 v20, v6

    .line 153
    :goto_1a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v2, v4, :cond_27

    .line 154
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    iget-object v5, v1, LX0/q;->y:Landroid/os/Bundle;

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 155
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    invoke-static {v4}, LX0/F;->c(Landroid/app/Notification$Builder;)V

    :cond_27
    const/16 v4, 0x1a

    if-lt v2, v4, :cond_29

    .line 156
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    invoke-static {v4}, LX0/G;->e(Landroid/app/Notification$Builder;)V

    .line 157
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    invoke-static {v4}, LX0/G;->h(Landroid/app/Notification$Builder;)V

    .line 158
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    iget-object v5, v1, LX0/q;->C:Ljava/lang/String;

    invoke-static {v4, v5}, LX0/G;->i(Landroid/app/Notification$Builder;Ljava/lang/String;)V

    .line 159
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    iget-wide v5, v1, LX0/q;->D:J

    invoke-static {v4, v5, v6}, LX0/G;->j(Landroid/app/Notification$Builder;J)V

    .line 160
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    iget v5, v1, LX0/q;->E:I

    invoke-static {v4, v5}, LX0/G;->g(Landroid/app/Notification$Builder;I)V

    .line 161
    iget-boolean v4, v1, LX0/q;->w:Z

    if-eqz v4, :cond_28

    .line 162
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    iget-boolean v5, v1, LX0/q;->v:Z

    invoke-static {v4, v5}, LX0/G;->f(Landroid/app/Notification$Builder;Z)V

    .line 163
    :cond_28
    iget-object v4, v1, LX0/q;->B:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_29

    .line 164
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v4

    const/4 v6, 0x0

    .line 165
    invoke-virtual {v4, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v4

    .line 166
    invoke-virtual {v4, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v4

    .line 167
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_29
    const/16 v4, 0x1c

    if-lt v2, v4, :cond_2a

    .line 168
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LX0/Q;

    .line 169
    iget-object v5, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v5, Landroid/app/Notification$Builder;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    invoke-static {v4}, LX0/H;->d(LX0/Q;)Landroid/app/Person;

    move-result-object v4

    .line 171
    invoke-static {v5, v4}, LX0/H;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)V

    goto :goto_1b

    .line 172
    :cond_2a
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v2, v4, :cond_2b

    .line 173
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    iget-boolean v5, v1, LX0/q;->F:Z

    invoke-static {v4, v5}, LX0/f;->b(Landroid/app/Notification$Builder;Z)V

    .line 174
    iget-object v4, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, Landroid/app/Notification$Builder;

    invoke-static {v4}, LX0/f;->c(Landroid/app/Notification$Builder;)V

    .line 175
    :cond_2b
    iget-boolean v1, v1, LX0/q;->H:Z

    if-eqz v1, :cond_2e

    .line 176
    iget-object v1, v0, LN2/j;->a:Ljava/lang/Object;

    check-cast v1, LX0/q;

    iget-boolean v1, v1, LX0/q;->t:Z

    if-eqz v1, :cond_2c

    const/4 v1, 0x2

    .line 177
    iput v1, v0, LN2/j;->b:I

    goto :goto_1c

    :cond_2c
    const/4 v1, 0x1

    .line 178
    iput v1, v0, LN2/j;->b:I

    .line 179
    :goto_1c
    iget-object v1, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 180
    iget-object v1, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    invoke-virtual {v1, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 181
    iget v1, v3, Landroid/app/Notification;->defaults:I

    and-int/lit8 v1, v1, -0x4

    .line 182
    iput v1, v3, Landroid/app/Notification;->defaults:I

    .line 183
    iget-object v3, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v3, Landroid/app/Notification$Builder;

    invoke-virtual {v3, v1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    const/16 v4, 0x1a

    if-lt v2, v4, :cond_2e

    .line 184
    iget-object v1, v0, LN2/j;->a:Ljava/lang/Object;

    check-cast v1, LX0/q;

    iget-object v1, v1, LX0/q;->s:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2d

    .line 185
    iget-object v1, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    .line 186
    const-string v2, "silent"

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 187
    :cond_2d
    iget-object v1, v0, LN2/j;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Notification$Builder;

    iget v2, v0, LN2/j;->b:I

    invoke-static {v1, v2}, LX0/G;->g(Landroid/app/Notification$Builder;I)V

    :cond_2e
    return-void
.end method

.method public constructor <init>(LY2/y;I)V
    .locals 4

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN2/j;->e:Ljava/lang/Object;

    .line 253
    new-instance p1, LJ5/y;

    const/4 v0, 0x5

    new-array v1, v0, [B

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 254
    invoke-direct {p1, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 255
    iput-object p1, p0, LN2/j;->c:Ljava/lang/Object;

    .line 256
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LN2/j;->d:Ljava/lang/Object;

    .line 257
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LN2/j;->a:Ljava/lang/Object;

    .line 258
    iput p2, p0, LN2/j;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lba/a;Lkc/e;)V
    .locals 2

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    new-instance v0, Lio/flutter/plugin/platform/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/flutter/plugin/platform/n;-><init>(Ljava/lang/Object;I)V

    .line 240
    iput-object p1, p0, LN2/j;->c:Ljava/lang/Object;

    .line 241
    iput-object p2, p0, LN2/j;->d:Ljava/lang/Object;

    .line 242
    iput-object v0, p2, Lba/a;->c:Ljava/lang/Object;

    .line 243
    iput-object p3, p0, LN2/j;->a:Ljava/lang/Object;

    const/16 p1, 0x500

    .line 244
    iput p1, p0, LN2/j;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[B[Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LN2/j;->c:Ljava/lang/Object;

    iput-object p2, p0, LN2/j;->d:Ljava/lang/Object;

    iput-object p3, p0, LN2/j;->a:Ljava/lang/Object;

    iput-object p4, p0, LN2/j;->e:Ljava/lang/Object;

    iput p5, p0, LN2/j;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, LN2/j;->b:I

    .line 190
    invoke-static {}, Lu6/a;->f()V

    const v1, 0x8b31

    .line 191
    invoke-static {v0, v1, p1}, LN2/j;->f(IILjava/lang/String;)V

    const p1, 0x8b30

    .line 192
    invoke-static {v0, p1, p2}, LN2/j;->f(IILjava/lang/String;)V

    .line 193
    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x0

    .line 194
    filled-new-array {p1}, [I

    move-result-object p2

    const v1, 0x8b82

    .line 195
    invoke-static {v0, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 196
    aget p2, p2, p1

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to link shader program: \n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 198
    invoke-static {v2, p2}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 199
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 200
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LN2/j;->a:Ljava/lang/Object;

    .line 201
    new-array p2, v1, [I

    const v2, 0x8b89

    .line 202
    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 203
    aget v0, p2, p1

    new-array v0, v0, [Lad/I;

    iput-object v0, p0, LN2/j;->c:Ljava/lang/Object;

    move v3, p1

    .line 204
    :goto_1
    aget v0, p2, p1

    if-ge v3, v0, :cond_3

    .line 205
    iget v2, p0, LN2/j;->b:I

    .line 206
    new-array v0, v1, [I

    const v4, 0x8b8a

    .line 207
    invoke-static {v2, v4, v0, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 208
    aget v4, v0, p1

    new-array v11, v4, [B

    .line 209
    new-array v5, v1, [I

    new-array v7, v1, [I

    new-array v9, v1, [I

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 210
    new-instance v0, Ljava/lang/String;

    move v5, p1

    :goto_2
    if-ge v5, v4, :cond_2

    .line 211
    aget-byte v6, v11, v5

    if-nez v6, :cond_1

    move v4, v5

    goto :goto_3

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 212
    :cond_2
    :goto_3
    invoke-direct {v0, v11, p1, v4}, Ljava/lang/String;-><init>([BII)V

    .line 213
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 214
    new-instance v2, Lad/I;

    const/16 v4, 0xe

    .line 215
    invoke-direct {v2, v4}, Lad/I;-><init>(I)V

    .line 216
    iget-object v4, p0, LN2/j;->c:Ljava/lang/Object;

    check-cast v4, [Lad/I;

    aput-object v2, v4, v3

    .line 217
    iget-object v4, p0, LN2/j;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 218
    :cond_3
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LN2/j;->e:Ljava/lang/Object;

    .line 219
    new-array p2, v1, [I

    .line 220
    iget v0, p0, LN2/j;->b:I

    const v2, 0x8b86

    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 221
    aget v0, p2, p1

    new-array v0, v0, [Lae/b;

    iput-object v0, p0, LN2/j;->d:Ljava/lang/Object;

    move v3, p1

    .line 222
    :goto_4
    aget v0, p2, p1

    if-ge v3, v0, :cond_6

    .line 223
    iget v2, p0, LN2/j;->b:I

    .line 224
    new-array v0, v1, [I

    const v4, 0x8b87

    .line 225
    invoke-static {v2, v4, v0, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 226
    new-array v9, v1, [I

    .line 227
    aget v4, v0, p1

    new-array v11, v4, [B

    .line 228
    new-array v5, v1, [I

    new-array v7, v1, [I

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 229
    new-instance v0, Ljava/lang/String;

    move v5, p1

    :goto_5
    if-ge v5, v4, :cond_5

    .line 230
    aget-byte v6, v11, v5

    if-nez v6, :cond_4

    move v4, v5

    goto :goto_6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 231
    :cond_5
    :goto_6
    invoke-direct {v0, v11, p1, v4}, Ljava/lang/String;-><init>([BII)V

    .line 232
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 233
    new-instance v2, Lae/b;

    .line 234
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 235
    iget-object v4, p0, LN2/j;->d:Ljava/lang/Object;

    check-cast v4, [Lae/b;

    aput-object v2, v4, v3

    .line 236
    iget-object v4, p0, LN2/j;->e:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 237
    :cond_6
    invoke-static {}, Lu6/a;->f()V

    return-void
.end method

.method public constructor <init>(Lk3/c;LH5/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    iget v0, p2, LH5/a;->b:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput v0, p0, LN2/j;->b:I

    .line 5
    iput-object p1, p0, LN2/j;->c:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, LN2/j;->d:Ljava/lang/Object;

    .line 7
    iput-object p3, p0, LN2/j;->a:Ljava/lang/Object;

    .line 8
    iput-object p4, p0, LN2/j;->e:Ljava/lang/Object;

    return-void
.end method

.method public static f(IILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x8b81

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v2, v1, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 20
    .line 21
    .line 22
    aget v1, v1, v0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    move v0, v2

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, ", source: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p2, v0}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lu6/a;->f()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static g(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, ":memory:"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-gt v3, v0, :cond_5

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    move v5, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v5, v0

    .line 25
    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/16 v6, 0x20

    .line 30
    .line 31
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->g(II)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-gtz v5, :cond_1

    .line 36
    .line 37
    move v5, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v5, v2

    .line 40
    :goto_2
    if-nez v4, :cond_3

    .line 41
    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    move v4, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    if-nez v5, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    :goto_3
    add-int/2addr v0, v1

    .line 56
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    const-string v0, "deleting the database file: "

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "SupportSQLite"

    .line 78
    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catch_0
    move-exception p0

    .line 92
    const-string v0, "delete failed: "

    .line 93
    .line 94
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    :cond_7
    :goto_4
    return-void
.end method

.method public static n(Landroid/app/Notification;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p0, Landroid/app/Notification;->vibrate:[J

    .line 5
    .line 6
    iget v0, p0, Landroid/app/Notification;->defaults:I

    .line 7
    .line 8
    and-int/lit8 v0, v0, -0x4

    .line 9
    .line 10
    iput v0, p0, Landroid/app/Notification;->defaults:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(LX0/k;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, LX0/k;->a()Landroidx/core/graphics/drawable/IconCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->j(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    new-instance v0, Landroid/app/Notification$Action$Builder;

    .line 13
    .line 14
    iget-object v2, p1, LX0/k;->i:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget-object v3, p1, LX0/k;->j:Landroid/app/PendingIntent;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x1d

    .line 22
    .line 23
    iget-object v2, p1, LX0/k;->c:[LX0/T;

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    new-array v3, v3, [Landroid/app/RemoteInput;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move v5, v4

    .line 32
    :goto_0
    array-length v6, v2

    .line 33
    if-ge v5, v6, :cond_3

    .line 34
    .line 35
    aget-object v6, v2, v5

    .line 36
    .line 37
    new-instance v7, Landroid/app/RemoteInput$Builder;

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-string v8, "FlutterLocalNotificationsPluginInputResult"

    .line 43
    .line 44
    invoke-direct {v7, v8}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v8, v6, LX0/T;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v7, v8}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    iget-object v8, v6, LX0/T;->b:[Ljava/lang/CharSequence;

    .line 54
    .line 55
    invoke-virtual {v7, v8}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-boolean v8, v6, LX0/T;->c:Z

    .line 60
    .line 61
    invoke-virtual {v7, v8}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    iget-object v8, v6, LX0/T;->d:Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-virtual {v7, v8}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v9, 0x1a

    .line 74
    .line 75
    if-lt v8, v9, :cond_1

    .line 76
    .line 77
    iget-object v6, v6, LX0/T;->e:Ljava/util/HashSet;

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_1

    .line 88
    .line 89
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v7, v8}, LX0/G;->d(Landroid/app/RemoteInput$Builder;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    if-lt v6, v1, :cond_2

    .line 102
    .line 103
    invoke-static {v7}, LX0/f;->e(Landroid/app/RemoteInput$Builder;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v7}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    aput-object v6, v3, v5

    .line 111
    .line 112
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    array-length v2, v3

    .line 116
    :goto_2
    if-ge v4, v2, :cond_4

    .line 117
    .line 118
    aget-object v5, v3, v4

    .line 119
    .line 120
    invoke-virtual {v0, v5}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    iget-object v2, p1, LX0/k;->a:Landroid/os/Bundle;

    .line 127
    .line 128
    if-eqz v2, :cond_5

    .line 129
    .line 130
    new-instance v3, Landroid/os/Bundle;

    .line 131
    .line 132
    invoke-direct {v3, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    new-instance v3, Landroid/os/Bundle;

    .line 137
    .line 138
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 139
    .line 140
    .line 141
    :goto_3
    iget-boolean v2, p1, LX0/k;->d:Z

    .line 142
    .line 143
    const-string v4, "android.support.allowGeneratedReplies"

    .line 144
    .line 145
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 149
    .line 150
    const/16 v5, 0x18

    .line 151
    .line 152
    if-lt v4, v5, :cond_6

    .line 153
    .line 154
    invoke-static {v0, v2}, LX0/F;->b(Landroid/app/Notification$Action$Builder;Z)V

    .line 155
    .line 156
    .line 157
    :cond_6
    const-string v2, "android.support.action.semanticAction"

    .line 158
    .line 159
    iget v5, p1, LX0/k;->f:I

    .line 160
    .line 161
    invoke-virtual {v3, v2, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 162
    .line 163
    .line 164
    const/16 v2, 0x1c

    .line 165
    .line 166
    if-lt v4, v2, :cond_7

    .line 167
    .line 168
    invoke-static {v0, v5}, LX0/H;->c(Landroid/app/Notification$Action$Builder;I)V

    .line 169
    .line 170
    .line 171
    :cond_7
    if-lt v4, v1, :cond_8

    .line 172
    .line 173
    iget-boolean v1, p1, LX0/k;->g:Z

    .line 174
    .line 175
    invoke-static {v0, v1}, LX0/f;->d(Landroid/app/Notification$Action$Builder;Z)V

    .line 176
    .line 177
    .line 178
    :cond_8
    const/16 v1, 0x1f

    .line 179
    .line 180
    if-lt v4, v1, :cond_9

    .line 181
    .line 182
    invoke-static {v0}, LX0/I;->a(Landroid/app/Notification$Action$Builder;)V

    .line 183
    .line 184
    .line 185
    :cond_9
    const-string v1, "android.support.action.showsUserInterface"

    .line 186
    .line 187
    iget-boolean p1, p1, LX0/k;->e:Z

    .line 188
    .line 189
    invoke-virtual {v3, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v3}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget-object v0, p0, LN2/j;->d:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Landroid/app/Notification$Builder;

    .line 202
    .line 203
    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public b(LQ1/u;Ls2/o;LT5/B;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(LY4/b;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, LY4/b;->q()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v2, v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_14

    .line 13
    .line 14
    :cond_0
    iget-object v2, v0, LN2/j;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LT5/z;

    .line 17
    .line 18
    iget v4, v2, LT5/z;->a:I

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    iget-object v7, v2, LT5/z;->c:Ljava/util/List;

    .line 23
    .line 24
    if-eq v4, v5, :cond_2

    .line 25
    .line 26
    if-eq v4, v3, :cond_2

    .line 27
    .line 28
    iget v4, v2, LT5/z;->m:I

    .line 29
    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v4, Lu6/t;

    .line 34
    .line 35
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Lu6/t;

    .line 40
    .line 41
    invoke-virtual {v8}, Lu6/t;->c()J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-direct {v4, v8, v9}, Lu6/t;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lu6/t;

    .line 57
    .line 58
    :goto_1
    invoke-virtual {v1}, LY4/b;->q()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    and-int/lit16 v7, v7, 0x80

    .line 63
    .line 64
    if-nez v7, :cond_3

    .line 65
    .line 66
    goto/16 :goto_14

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v1, v5}, LY4/b;->B(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, LY4/b;->v()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v8, 0x3

    .line 76
    invoke-virtual {v1, v8}, LY4/b;->B(I)V

    .line 77
    .line 78
    .line 79
    iget-object v9, v0, LN2/j;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v9, LJ5/y;

    .line 82
    .line 83
    iget-object v10, v9, LJ5/y;->b:[B

    .line 84
    .line 85
    invoke-virtual {v1, v6, v3, v10}, LY4/b;->c(II[B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v8}, LJ5/y;->t(I)V

    .line 92
    .line 93
    .line 94
    const/16 v10, 0xd

    .line 95
    .line 96
    invoke-virtual {v9, v10}, LJ5/y;->i(I)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    iput v11, v2, LT5/z;->s:I

    .line 101
    .line 102
    iget-object v11, v9, LJ5/y;->b:[B

    .line 103
    .line 104
    invoke-virtual {v1, v6, v3, v11}, LY4/b;->c(II[B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 108
    .line 109
    .line 110
    const/4 v11, 0x4

    .line 111
    invoke-virtual {v9, v11}, LJ5/y;->t(I)V

    .line 112
    .line 113
    .line 114
    const/16 v12, 0xc

    .line 115
    .line 116
    invoke-virtual {v9, v12}, LJ5/y;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    invoke-virtual {v1, v13}, LY4/b;->B(I)V

    .line 121
    .line 122
    .line 123
    iget-object v13, v2, LT5/z;->f:LA/e0;

    .line 124
    .line 125
    iget v14, v2, LT5/z;->a:I

    .line 126
    .line 127
    const/16 v15, 0x2000

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const/16 v12, 0x15

    .line 131
    .line 132
    if-ne v14, v3, :cond_4

    .line 133
    .line 134
    iget-object v3, v2, LT5/z;->q:LT5/C;

    .line 135
    .line 136
    if-nez v3, :cond_4

    .line 137
    .line 138
    new-instance v3, LDd/c;

    .line 139
    .line 140
    sget-object v11, Lu6/v;->f:[B

    .line 141
    .line 142
    invoke-direct {v3, v12, v5, v5, v11}, LDd/c;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13, v12, v3}, LA/e0;->i(ILDd/c;)LT5/C;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iput-object v3, v2, LT5/z;->q:LT5/C;

    .line 150
    .line 151
    if-eqz v3, :cond_4

    .line 152
    .line 153
    iget-object v11, v2, LT5/z;->l:LJ5/m;

    .line 154
    .line 155
    new-instance v5, LT5/B;

    .line 156
    .line 157
    const/4 v10, 0x0

    .line 158
    invoke-direct {v5, v7, v12, v15, v10}, LT5/B;-><init>(IIII)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v3, v4, v11, v5}, LT5/C;->d(Lu6/t;LJ5/m;LT5/B;)V

    .line 162
    .line 163
    .line 164
    :cond_4
    iget-object v3, v0, LN2/j;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v3, Landroid/util/SparseArray;

    .line 167
    .line 168
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 169
    .line 170
    .line 171
    iget-object v5, v0, LN2/j;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v5, Landroid/util/SparseIntArray;

    .line 174
    .line 175
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->clear()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, LY4/b;->a()I

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    :goto_2
    iget-object v11, v2, LT5/z;->h:Landroid/util/SparseBooleanArray;

    .line 183
    .line 184
    if-lez v10, :cond_1b

    .line 185
    .line 186
    iget-object v15, v9, LJ5/y;->b:[B

    .line 187
    .line 188
    const/4 v12, 0x5

    .line 189
    invoke-virtual {v1, v6, v12, v15}, LY4/b;->c(II[B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 193
    .line 194
    .line 195
    const/16 v15, 0x8

    .line 196
    .line 197
    invoke-virtual {v9, v15}, LJ5/y;->i(I)I

    .line 198
    .line 199
    .line 200
    move-result v15

    .line 201
    invoke-virtual {v9, v8}, LJ5/y;->t(I)V

    .line 202
    .line 203
    .line 204
    const/16 v6, 0xd

    .line 205
    .line 206
    invoke-virtual {v9, v6}, LJ5/y;->i(I)I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    const/4 v6, 0x4

    .line 211
    invoke-virtual {v9, v6}, LJ5/y;->t(I)V

    .line 212
    .line 213
    .line 214
    const/16 v6, 0xc

    .line 215
    .line 216
    invoke-virtual {v9, v6}, LJ5/y;->i(I)I

    .line 217
    .line 218
    .line 219
    move-result v16

    .line 220
    iget v6, v1, LY4/b;->b:I

    .line 221
    .line 222
    add-int v12, v6, v16

    .line 223
    .line 224
    const/16 v18, -0x1

    .line 225
    .line 226
    move-object/from16 v20, v4

    .line 227
    .line 228
    move-object/from16 v19, v9

    .line 229
    .line 230
    move/from16 v9, v18

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    move/from16 v18, v10

    .line 234
    .line 235
    const/4 v10, 0x0

    .line 236
    :goto_3
    iget v4, v1, LY4/b;->b:I

    .line 237
    .line 238
    if-ge v4, v12, :cond_13

    .line 239
    .line 240
    invoke-virtual {v1}, LY4/b;->q()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-virtual {v1}, LY4/b;->q()I

    .line 245
    .line 246
    .line 247
    move-result v21

    .line 248
    move/from16 v22, v7

    .line 249
    .line 250
    iget v7, v1, LY4/b;->b:I

    .line 251
    .line 252
    add-int v7, v7, v21

    .line 253
    .line 254
    if-le v7, v12, :cond_5

    .line 255
    .line 256
    :goto_4
    move-object/from16 v25, v3

    .line 257
    .line 258
    const/4 v3, 0x4

    .line 259
    const/16 v17, 0x3

    .line 260
    .line 261
    goto/16 :goto_b

    .line 262
    .line 263
    :cond_5
    const/16 v21, 0xac

    .line 264
    .line 265
    const/16 v23, 0x87

    .line 266
    .line 267
    const/16 v24, 0x81

    .line 268
    .line 269
    move-object/from16 v25, v3

    .line 270
    .line 271
    const/4 v3, 0x5

    .line 272
    if-ne v4, v3, :cond_a

    .line 273
    .line 274
    invoke-virtual {v1}, LY4/b;->r()J

    .line 275
    .line 276
    .line 277
    move-result-wide v3

    .line 278
    const-wide/32 v26, 0x41432d33

    .line 279
    .line 280
    .line 281
    cmp-long v26, v3, v26

    .line 282
    .line 283
    if-nez v26, :cond_6

    .line 284
    .line 285
    move/from16 v9, v24

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_6
    const-wide/32 v26, 0x45414333

    .line 289
    .line 290
    .line 291
    cmp-long v24, v3, v26

    .line 292
    .line 293
    if-nez v24, :cond_7

    .line 294
    .line 295
    move/from16 v9, v23

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_7
    const-wide/32 v23, 0x41432d34

    .line 299
    .line 300
    .line 301
    cmp-long v23, v3, v23

    .line 302
    .line 303
    if-nez v23, :cond_8

    .line 304
    .line 305
    :goto_5
    move/from16 v9, v21

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_8
    const-wide/32 v23, 0x48455643

    .line 309
    .line 310
    .line 311
    cmp-long v3, v3, v23

    .line 312
    .line 313
    if-nez v3, :cond_9

    .line 314
    .line 315
    const/16 v9, 0x24

    .line 316
    .line 317
    :cond_9
    :goto_6
    move/from16 v21, v7

    .line 318
    .line 319
    :goto_7
    const/4 v3, 0x4

    .line 320
    :goto_8
    const/16 v17, 0x3

    .line 321
    .line 322
    goto/16 :goto_a

    .line 323
    .line 324
    :cond_a
    const/16 v3, 0x6a

    .line 325
    .line 326
    if-ne v4, v3, :cond_b

    .line 327
    .line 328
    move/from16 v21, v7

    .line 329
    .line 330
    move/from16 v9, v24

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_b
    const/16 v3, 0x7a

    .line 334
    .line 335
    if-ne v4, v3, :cond_c

    .line 336
    .line 337
    move/from16 v21, v7

    .line 338
    .line 339
    move/from16 v9, v23

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_c
    const/16 v3, 0x7f

    .line 343
    .line 344
    if-ne v4, v3, :cond_d

    .line 345
    .line 346
    invoke-virtual {v1}, LY4/b;->q()I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    const/16 v4, 0x15

    .line 351
    .line 352
    if-ne v3, v4, :cond_9

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_d
    const/16 v3, 0x7b

    .line 356
    .line 357
    if-ne v4, v3, :cond_e

    .line 358
    .line 359
    const/16 v3, 0x8a

    .line 360
    .line 361
    move v9, v3

    .line 362
    goto :goto_6

    .line 363
    :cond_e
    const/16 v3, 0xa

    .line 364
    .line 365
    if-ne v4, v3, :cond_f

    .line 366
    .line 367
    sget-object v3, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 368
    .line 369
    const/4 v4, 0x3

    .line 370
    invoke-virtual {v1, v4, v3}, LY4/b;->o(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    goto :goto_6

    .line 379
    :cond_f
    const/16 v3, 0x59

    .line 380
    .line 381
    if-ne v4, v3, :cond_11

    .line 382
    .line 383
    new-instance v0, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 386
    .line 387
    .line 388
    :goto_9
    iget v4, v1, LY4/b;->b:I

    .line 389
    .line 390
    if-ge v4, v7, :cond_10

    .line 391
    .line 392
    sget-object v4, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 393
    .line 394
    const/4 v9, 0x3

    .line 395
    invoke-virtual {v1, v9, v4}, LY4/b;->o(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-virtual {v1}, LY4/b;->q()I

    .line 404
    .line 405
    .line 406
    const/4 v3, 0x4

    .line 407
    new-array v9, v3, [B

    .line 408
    .line 409
    move/from16 v21, v7

    .line 410
    .line 411
    const/4 v7, 0x0

    .line 412
    invoke-virtual {v1, v7, v3, v9}, LY4/b;->c(II[B)V

    .line 413
    .line 414
    .line 415
    new-instance v7, LT5/A;

    .line 416
    .line 417
    invoke-direct {v7, v4, v9}, LT5/A;-><init>(Ljava/lang/String;[B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move/from16 v7, v21

    .line 424
    .line 425
    const/16 v3, 0x59

    .line 426
    .line 427
    goto :goto_9

    .line 428
    :cond_10
    move/from16 v21, v7

    .line 429
    .line 430
    const/4 v3, 0x4

    .line 431
    const/16 v9, 0x59

    .line 432
    .line 433
    goto :goto_8

    .line 434
    :cond_11
    move/from16 v21, v7

    .line 435
    .line 436
    const/4 v3, 0x4

    .line 437
    const/16 v17, 0x3

    .line 438
    .line 439
    const/16 v7, 0x6f

    .line 440
    .line 441
    if-ne v4, v7, :cond_12

    .line 442
    .line 443
    const/16 v4, 0x101

    .line 444
    .line 445
    move v9, v4

    .line 446
    :cond_12
    :goto_a
    iget v4, v1, LY4/b;->b:I

    .line 447
    .line 448
    sub-int v7, v21, v4

    .line 449
    .line 450
    invoke-virtual {v1, v7}, LY4/b;->B(I)V

    .line 451
    .line 452
    .line 453
    move/from16 v7, v22

    .line 454
    .line 455
    move-object/from16 v3, v25

    .line 456
    .line 457
    goto/16 :goto_3

    .line 458
    .line 459
    :cond_13
    move/from16 v22, v7

    .line 460
    .line 461
    goto/16 :goto_4

    .line 462
    .line 463
    :goto_b
    invoke-virtual {v1, v12}, LY4/b;->A(I)V

    .line 464
    .line 465
    .line 466
    new-instance v4, LDd/c;

    .line 467
    .line 468
    iget-object v7, v1, LY4/b;->a:[B

    .line 469
    .line 470
    invoke-static {v7, v6, v12}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    invoke-direct {v4, v9, v10, v0, v6}, LDd/c;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    .line 475
    .line 476
    .line 477
    const/4 v0, 0x6

    .line 478
    if-eq v15, v0, :cond_14

    .line 479
    .line 480
    const/4 v0, 0x5

    .line 481
    if-ne v15, v0, :cond_15

    .line 482
    .line 483
    :cond_14
    move v15, v9

    .line 484
    :cond_15
    add-int/lit8 v16, v16, 0x5

    .line 485
    .line 486
    sub-int v10, v18, v16

    .line 487
    .line 488
    const/4 v0, 0x2

    .line 489
    if-ne v14, v0, :cond_16

    .line 490
    .line 491
    move v6, v15

    .line 492
    goto :goto_c

    .line 493
    :cond_16
    move v6, v8

    .line 494
    :goto_c
    invoke-virtual {v11, v6}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    if-eqz v7, :cond_17

    .line 499
    .line 500
    move-object/from16 v0, v25

    .line 501
    .line 502
    const/16 v7, 0x15

    .line 503
    .line 504
    goto :goto_f

    .line 505
    :cond_17
    const/16 v7, 0x15

    .line 506
    .line 507
    if-ne v14, v0, :cond_18

    .line 508
    .line 509
    if-ne v15, v7, :cond_18

    .line 510
    .line 511
    iget-object v4, v2, LT5/z;->q:LT5/C;

    .line 512
    .line 513
    goto :goto_d

    .line 514
    :cond_18
    invoke-virtual {v13, v15, v4}, LA/e0;->i(ILDd/c;)LT5/C;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    :goto_d
    if-ne v14, v0, :cond_1a

    .line 519
    .line 520
    const/16 v0, 0x2000

    .line 521
    .line 522
    invoke-virtual {v5, v6, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 523
    .line 524
    .line 525
    move-result v9

    .line 526
    if-ge v8, v9, :cond_19

    .line 527
    .line 528
    goto :goto_e

    .line 529
    :cond_19
    move-object/from16 v0, v25

    .line 530
    .line 531
    goto :goto_f

    .line 532
    :cond_1a
    :goto_e
    invoke-virtual {v5, v6, v8}, Landroid/util/SparseIntArray;->put(II)V

    .line 533
    .line 534
    .line 535
    move-object/from16 v0, v25

    .line 536
    .line 537
    invoke-virtual {v0, v6, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    :goto_f
    move-object v3, v0

    .line 541
    move v12, v7

    .line 542
    move/from16 v8, v17

    .line 543
    .line 544
    move-object/from16 v9, v19

    .line 545
    .line 546
    move-object/from16 v4, v20

    .line 547
    .line 548
    move/from16 v7, v22

    .line 549
    .line 550
    const/4 v6, 0x0

    .line 551
    const/16 v15, 0x2000

    .line 552
    .line 553
    move-object/from16 v0, p0

    .line 554
    .line 555
    goto/16 :goto_2

    .line 556
    .line 557
    :cond_1b
    move-object v0, v3

    .line 558
    move-object/from16 v20, v4

    .line 559
    .line 560
    move/from16 v22, v7

    .line 561
    .line 562
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->size()I

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    const/4 v7, 0x0

    .line 567
    :goto_10
    iget-object v3, v2, LT5/z;->g:Landroid/util/SparseArray;

    .line 568
    .line 569
    if-ge v7, v1, :cond_1e

    .line 570
    .line 571
    invoke-virtual {v5, v7}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 572
    .line 573
    .line 574
    move-result v4

    .line 575
    invoke-virtual {v5, v7}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    const/4 v8, 0x1

    .line 580
    invoke-virtual {v11, v4, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 581
    .line 582
    .line 583
    iget-object v9, v2, LT5/z;->i:Landroid/util/SparseBooleanArray;

    .line 584
    .line 585
    invoke-virtual {v9, v6, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v8

    .line 592
    check-cast v8, LT5/C;

    .line 593
    .line 594
    if-eqz v8, :cond_1d

    .line 595
    .line 596
    iget-object v9, v2, LT5/z;->q:LT5/C;

    .line 597
    .line 598
    if-eq v8, v9, :cond_1c

    .line 599
    .line 600
    iget-object v9, v2, LT5/z;->l:LJ5/m;

    .line 601
    .line 602
    new-instance v10, LT5/B;

    .line 603
    .line 604
    const/4 v12, 0x0

    .line 605
    move/from16 v13, v22

    .line 606
    .line 607
    const/16 v15, 0x2000

    .line 608
    .line 609
    invoke-direct {v10, v13, v4, v15, v12}, LT5/B;-><init>(IIII)V

    .line 610
    .line 611
    .line 612
    move-object/from16 v4, v20

    .line 613
    .line 614
    invoke-interface {v8, v4, v9, v10}, LT5/C;->d(Lu6/t;LJ5/m;LT5/B;)V

    .line 615
    .line 616
    .line 617
    goto :goto_11

    .line 618
    :cond_1c
    move-object/from16 v4, v20

    .line 619
    .line 620
    move/from16 v13, v22

    .line 621
    .line 622
    const/16 v15, 0x2000

    .line 623
    .line 624
    :goto_11
    invoke-virtual {v3, v6, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    goto :goto_12

    .line 628
    :cond_1d
    move-object/from16 v4, v20

    .line 629
    .line 630
    move/from16 v13, v22

    .line 631
    .line 632
    const/16 v15, 0x2000

    .line 633
    .line 634
    :goto_12
    add-int/lit8 v7, v7, 0x1

    .line 635
    .line 636
    move-object/from16 v20, v4

    .line 637
    .line 638
    move/from16 v22, v13

    .line 639
    .line 640
    goto :goto_10

    .line 641
    :cond_1e
    const/4 v6, 0x2

    .line 642
    if-ne v14, v6, :cond_20

    .line 643
    .line 644
    iget-boolean v0, v2, LT5/z;->n:Z

    .line 645
    .line 646
    if-nez v0, :cond_1f

    .line 647
    .line 648
    iget-object v0, v2, LT5/z;->l:LJ5/m;

    .line 649
    .line 650
    invoke-interface {v0}, LJ5/m;->l()V

    .line 651
    .line 652
    .line 653
    const/4 v7, 0x0

    .line 654
    iput v7, v2, LT5/z;->m:I

    .line 655
    .line 656
    const/4 v8, 0x1

    .line 657
    iput-boolean v8, v2, LT5/z;->n:Z

    .line 658
    .line 659
    return-void

    .line 660
    :cond_1f
    move-object/from16 v0, p0

    .line 661
    .line 662
    goto :goto_14

    .line 663
    :cond_20
    move-object/from16 v0, p0

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    const/4 v8, 0x1

    .line 667
    iget v1, v0, LN2/j;->b:I

    .line 668
    .line 669
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 670
    .line 671
    .line 672
    if-ne v14, v8, :cond_21

    .line 673
    .line 674
    move v6, v7

    .line 675
    goto :goto_13

    .line 676
    :cond_21
    iget v1, v2, LT5/z;->m:I

    .line 677
    .line 678
    add-int/lit8 v6, v1, -0x1

    .line 679
    .line 680
    :goto_13
    iput v6, v2, LT5/z;->m:I

    .line 681
    .line 682
    if-nez v6, :cond_22

    .line 683
    .line 684
    iget-object v1, v2, LT5/z;->l:LJ5/m;

    .line 685
    .line 686
    invoke-interface {v1}, LJ5/m;->l()V

    .line 687
    .line 688
    .line 689
    iput-boolean v8, v2, LT5/z;->n:Z

    .line 690
    .line 691
    :cond_22
    :goto_14
    return-void
.end method

.method public d(Lu6/t;LJ5/m;LT5/B;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(LQ1/o;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v2, v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_13

    .line 13
    .line 14
    :cond_0
    iget-object v2, v0, LN2/j;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LY2/y;

    .line 17
    .line 18
    iget v4, v2, LY2/y;->a:I

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    iget-object v7, v2, LY2/y;->c:Ljava/util/List;

    .line 23
    .line 24
    if-eq v4, v5, :cond_2

    .line 25
    .line 26
    if-eq v4, v3, :cond_2

    .line 27
    .line 28
    iget v4, v2, LY2/y;->n:I

    .line 29
    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v4, LQ1/u;

    .line 34
    .line 35
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, LQ1/u;

    .line 40
    .line 41
    invoke-virtual {v8}, LQ1/u;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-direct {v4, v8, v9}, LQ1/u;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, LQ1/u;

    .line 57
    .line 58
    :goto_1
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    and-int/lit16 v7, v7, 0x80

    .line 63
    .line 64
    if-nez v7, :cond_3

    .line 65
    .line 66
    goto/16 :goto_13

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v1, v5}, LQ1/o;->H(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, LQ1/o;->A()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v8, 0x3

    .line 76
    invoke-virtual {v1, v8}, LQ1/o;->H(I)V

    .line 77
    .line 78
    .line 79
    iget-object v9, v0, LN2/j;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v9, LJ5/y;

    .line 82
    .line 83
    iget-object v10, v9, LJ5/y;->b:[B

    .line 84
    .line 85
    invoke-virtual {v1, v6, v3, v10}, LQ1/o;->f(II[B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v8}, LJ5/y;->t(I)V

    .line 92
    .line 93
    .line 94
    const/16 v10, 0xd

    .line 95
    .line 96
    invoke-virtual {v9, v10}, LJ5/y;->i(I)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    iput v11, v2, LY2/y;->t:I

    .line 101
    .line 102
    iget-object v11, v9, LJ5/y;->b:[B

    .line 103
    .line 104
    invoke-virtual {v1, v6, v3, v11}, LQ1/o;->f(II[B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 108
    .line 109
    .line 110
    const/4 v11, 0x4

    .line 111
    invoke-virtual {v9, v11}, LJ5/y;->t(I)V

    .line 112
    .line 113
    .line 114
    const/16 v12, 0xc

    .line 115
    .line 116
    invoke-virtual {v9, v12}, LJ5/y;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    invoke-virtual {v1, v13}, LQ1/o;->H(I)V

    .line 121
    .line 122
    .line 123
    iget-object v13, v2, LY2/y;->f:LY2/f;

    .line 124
    .line 125
    iget v14, v2, LY2/y;->a:I

    .line 126
    .line 127
    const/16 v15, 0x2000

    .line 128
    .line 129
    const/16 v5, 0x15

    .line 130
    .line 131
    if-ne v14, v3, :cond_4

    .line 132
    .line 133
    iget-object v3, v2, LY2/y;->r:LY2/A;

    .line 134
    .line 135
    if-nez v3, :cond_4

    .line 136
    .line 137
    new-instance v16, LQ1/n;

    .line 138
    .line 139
    sget-object v21, LQ1/x;->f:[B

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v17, 0x15

    .line 146
    .line 147
    const/16 v20, 0x0

    .line 148
    .line 149
    invoke-direct/range {v16 .. v21}, LQ1/n;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v3, v16

    .line 153
    .line 154
    invoke-virtual {v13, v5, v3}, LY2/f;->a(ILQ1/n;)LY2/A;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iput-object v3, v2, LY2/y;->r:LY2/A;

    .line 159
    .line 160
    if-eqz v3, :cond_4

    .line 161
    .line 162
    iget-object v12, v2, LY2/y;->m:Ls2/o;

    .line 163
    .line 164
    new-instance v11, LT5/B;

    .line 165
    .line 166
    const/4 v10, 0x1

    .line 167
    invoke-direct {v11, v7, v5, v15, v10}, LT5/B;-><init>(IIII)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v3, v4, v12, v11}, LY2/A;->b(LQ1/u;Ls2/o;LT5/B;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    iget-object v3, v0, LN2/j;->d:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v3, Landroid/util/SparseArray;

    .line 176
    .line 177
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 178
    .line 179
    .line 180
    iget-object v10, v0, LN2/j;->a:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v10, Landroid/util/SparseIntArray;

    .line 183
    .line 184
    invoke-virtual {v10}, Landroid/util/SparseIntArray;->clear()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    :goto_2
    iget-object v12, v2, LY2/y;->i:Landroid/util/SparseBooleanArray;

    .line 192
    .line 193
    if-lez v11, :cond_1d

    .line 194
    .line 195
    iget-object v15, v9, LJ5/y;->b:[B

    .line 196
    .line 197
    const/4 v5, 0x5

    .line 198
    invoke-virtual {v1, v6, v5, v15}, LQ1/o;->f(II[B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 202
    .line 203
    .line 204
    const/16 v15, 0x8

    .line 205
    .line 206
    invoke-virtual {v9, v15}, LJ5/y;->i(I)I

    .line 207
    .line 208
    .line 209
    move-result v15

    .line 210
    invoke-virtual {v9, v8}, LJ5/y;->t(I)V

    .line 211
    .line 212
    .line 213
    const/16 v6, 0xd

    .line 214
    .line 215
    invoke-virtual {v9, v6}, LJ5/y;->i(I)I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    const/4 v6, 0x4

    .line 220
    invoke-virtual {v9, v6}, LJ5/y;->t(I)V

    .line 221
    .line 222
    .line 223
    const/16 v6, 0xc

    .line 224
    .line 225
    invoke-virtual {v9, v6}, LJ5/y;->i(I)I

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    iget v6, v1, LQ1/o;->b:I

    .line 230
    .line 231
    add-int v5, v6, v16

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/16 v23, -0x1

    .line 236
    .line 237
    move-object/from16 v26, v22

    .line 238
    .line 239
    move-object/from16 v28, v26

    .line 240
    .line 241
    move/from16 v25, v23

    .line 242
    .line 243
    const/16 v27, 0x0

    .line 244
    .line 245
    move-object/from16 v22, v9

    .line 246
    .line 247
    :goto_3
    iget v9, v1, LQ1/o;->b:I

    .line 248
    .line 249
    if-ge v9, v5, :cond_15

    .line 250
    .line 251
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 256
    .line 257
    .line 258
    move-result v23

    .line 259
    move/from16 v30, v11

    .line 260
    .line 261
    iget v11, v1, LQ1/o;->b:I

    .line 262
    .line 263
    add-int v11, v11, v23

    .line 264
    .line 265
    if-le v11, v5, :cond_5

    .line 266
    .line 267
    :goto_4
    move-object/from16 v17, v4

    .line 268
    .line 269
    move/from16 v31, v7

    .line 270
    .line 271
    const/4 v11, 0x4

    .line 272
    goto/16 :goto_b

    .line 273
    .line 274
    :cond_5
    const/16 v23, 0xac

    .line 275
    .line 276
    const/16 v24, 0x87

    .line 277
    .line 278
    const/16 v29, 0x81

    .line 279
    .line 280
    const/4 v0, 0x5

    .line 281
    if-ne v9, v0, :cond_a

    .line 282
    .line 283
    invoke-virtual {v1}, LQ1/o;->w()J

    .line 284
    .line 285
    .line 286
    move-result-wide v31

    .line 287
    const-wide/32 v33, 0x41432d33

    .line 288
    .line 289
    .line 290
    cmp-long v0, v31, v33

    .line 291
    .line 292
    if-nez v0, :cond_6

    .line 293
    .line 294
    move/from16 v25, v29

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_6
    const-wide/32 v33, 0x45414333

    .line 298
    .line 299
    .line 300
    cmp-long v0, v31, v33

    .line 301
    .line 302
    if-nez v0, :cond_7

    .line 303
    .line 304
    move/from16 v25, v24

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_7
    const-wide/32 v33, 0x41432d34

    .line 308
    .line 309
    .line 310
    cmp-long v0, v31, v33

    .line 311
    .line 312
    if-nez v0, :cond_8

    .line 313
    .line 314
    :goto_5
    move/from16 v25, v23

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_8
    const-wide/32 v23, 0x48455643

    .line 318
    .line 319
    .line 320
    cmp-long v0, v31, v23

    .line 321
    .line 322
    if-nez v0, :cond_9

    .line 323
    .line 324
    const/16 v25, 0x24

    .line 325
    .line 326
    :cond_9
    :goto_6
    move-object/from16 v17, v4

    .line 327
    .line 328
    move/from16 v31, v7

    .line 329
    .line 330
    :goto_7
    move/from16 v24, v11

    .line 331
    .line 332
    :goto_8
    const/4 v11, 0x4

    .line 333
    goto/16 :goto_a

    .line 334
    .line 335
    :cond_a
    const/16 v0, 0x6a

    .line 336
    .line 337
    if-ne v9, v0, :cond_b

    .line 338
    .line 339
    move-object/from16 v17, v4

    .line 340
    .line 341
    move/from16 v31, v7

    .line 342
    .line 343
    move/from16 v24, v11

    .line 344
    .line 345
    move/from16 v25, v29

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_b
    const/16 v0, 0x7a

    .line 349
    .line 350
    if-ne v9, v0, :cond_c

    .line 351
    .line 352
    move-object/from16 v17, v4

    .line 353
    .line 354
    move/from16 v31, v7

    .line 355
    .line 356
    move/from16 v25, v24

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_c
    const/16 v0, 0x7f

    .line 360
    .line 361
    if-ne v9, v0, :cond_f

    .line 362
    .line 363
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    const/16 v9, 0x15

    .line 368
    .line 369
    if-ne v0, v9, :cond_d

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_d
    const/16 v9, 0xe

    .line 373
    .line 374
    if-ne v0, v9, :cond_e

    .line 375
    .line 376
    const/16 v25, 0x88

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_e
    const/16 v9, 0x21

    .line 380
    .line 381
    if-ne v0, v9, :cond_9

    .line 382
    .line 383
    const/16 v25, 0x8b

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_f
    const/16 v0, 0x7b

    .line 387
    .line 388
    if-ne v9, v0, :cond_10

    .line 389
    .line 390
    const/16 v0, 0x8a

    .line 391
    .line 392
    move/from16 v25, v0

    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_10
    const/16 v0, 0xa

    .line 396
    .line 397
    if-ne v9, v0, :cond_11

    .line 398
    .line 399
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 400
    .line 401
    const/4 v9, 0x3

    .line 402
    invoke-virtual {v1, v9, v0}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 411
    .line 412
    .line 413
    move-result v27

    .line 414
    move-object/from16 v26, v0

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_11
    const/16 v0, 0x59

    .line 418
    .line 419
    if-ne v9, v0, :cond_13

    .line 420
    .line 421
    new-instance v9, Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 424
    .line 425
    .line 426
    :goto_9
    iget v0, v1, LQ1/o;->b:I

    .line 427
    .line 428
    if-ge v0, v11, :cond_12

    .line 429
    .line 430
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 431
    .line 432
    move/from16 v24, v11

    .line 433
    .line 434
    const/4 v11, 0x3

    .line 435
    invoke-virtual {v1, v11, v0}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 444
    .line 445
    .line 446
    move-object/from16 v17, v4

    .line 447
    .line 448
    const/4 v11, 0x4

    .line 449
    new-array v4, v11, [B

    .line 450
    .line 451
    move/from16 v31, v7

    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    invoke-virtual {v1, v7, v11, v4}, LQ1/o;->f(II[B)V

    .line 455
    .line 456
    .line 457
    new-instance v7, LY2/z;

    .line 458
    .line 459
    invoke-direct {v7, v0, v4}, LY2/z;-><init>(Ljava/lang/String;[B)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-object/from16 v4, v17

    .line 466
    .line 467
    move/from16 v11, v24

    .line 468
    .line 469
    move/from16 v7, v31

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_12
    move-object/from16 v17, v4

    .line 473
    .line 474
    move/from16 v31, v7

    .line 475
    .line 476
    move/from16 v24, v11

    .line 477
    .line 478
    const/4 v11, 0x4

    .line 479
    move-object/from16 v28, v9

    .line 480
    .line 481
    const/16 v25, 0x59

    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_13
    move-object/from16 v17, v4

    .line 485
    .line 486
    move/from16 v31, v7

    .line 487
    .line 488
    move/from16 v24, v11

    .line 489
    .line 490
    const/4 v11, 0x4

    .line 491
    const/16 v0, 0x6f

    .line 492
    .line 493
    if-ne v9, v0, :cond_14

    .line 494
    .line 495
    const/16 v0, 0x101

    .line 496
    .line 497
    move/from16 v25, v0

    .line 498
    .line 499
    :cond_14
    :goto_a
    iget v0, v1, LQ1/o;->b:I

    .line 500
    .line 501
    sub-int v0, v24, v0

    .line 502
    .line 503
    invoke-virtual {v1, v0}, LQ1/o;->H(I)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v0, p0

    .line 507
    .line 508
    move-object/from16 v4, v17

    .line 509
    .line 510
    move/from16 v11, v30

    .line 511
    .line 512
    move/from16 v7, v31

    .line 513
    .line 514
    goto/16 :goto_3

    .line 515
    .line 516
    :cond_15
    move/from16 v30, v11

    .line 517
    .line 518
    goto/16 :goto_4

    .line 519
    .line 520
    :goto_b
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 521
    .line 522
    .line 523
    new-instance v24, LQ1/n;

    .line 524
    .line 525
    iget-object v0, v1, LQ1/o;->a:[B

    .line 526
    .line 527
    invoke-static {v0, v6, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 528
    .line 529
    .line 530
    move-result-object v29

    .line 531
    invoke-direct/range {v24 .. v29}, LQ1/n;-><init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V

    .line 532
    .line 533
    .line 534
    move-object/from16 v0, v24

    .line 535
    .line 536
    const/4 v4, 0x6

    .line 537
    if-eq v15, v4, :cond_16

    .line 538
    .line 539
    const/4 v4, 0x5

    .line 540
    if-ne v15, v4, :cond_17

    .line 541
    .line 542
    :cond_16
    move/from16 v15, v25

    .line 543
    .line 544
    :cond_17
    add-int/lit8 v16, v16, 0x5

    .line 545
    .line 546
    sub-int v4, v30, v16

    .line 547
    .line 548
    const/4 v5, 0x2

    .line 549
    if-ne v14, v5, :cond_18

    .line 550
    .line 551
    move v6, v15

    .line 552
    goto :goto_c

    .line 553
    :cond_18
    move v6, v8

    .line 554
    :goto_c
    invoke-virtual {v12, v6}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 555
    .line 556
    .line 557
    move-result v7

    .line 558
    if-eqz v7, :cond_19

    .line 559
    .line 560
    const/16 v9, 0x15

    .line 561
    .line 562
    goto :goto_e

    .line 563
    :cond_19
    const/16 v9, 0x15

    .line 564
    .line 565
    if-ne v14, v5, :cond_1a

    .line 566
    .line 567
    if-ne v15, v9, :cond_1a

    .line 568
    .line 569
    iget-object v0, v2, LY2/y;->r:LY2/A;

    .line 570
    .line 571
    goto :goto_d

    .line 572
    :cond_1a
    invoke-virtual {v13, v15, v0}, LY2/f;->a(ILQ1/n;)LY2/A;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    :goto_d
    if-ne v14, v5, :cond_1b

    .line 577
    .line 578
    const/16 v5, 0x2000

    .line 579
    .line 580
    invoke-virtual {v10, v6, v5}, Landroid/util/SparseIntArray;->get(II)I

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    if-ge v8, v7, :cond_1c

    .line 585
    .line 586
    :cond_1b
    invoke-virtual {v10, v6, v8}, Landroid/util/SparseIntArray;->put(II)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3, v6, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    :cond_1c
    :goto_e
    move-object/from16 v0, p0

    .line 593
    .line 594
    move v11, v4

    .line 595
    move v5, v9

    .line 596
    move-object/from16 v4, v17

    .line 597
    .line 598
    move-object/from16 v9, v22

    .line 599
    .line 600
    move/from16 v7, v31

    .line 601
    .line 602
    const/4 v6, 0x0

    .line 603
    const/4 v8, 0x3

    .line 604
    const/16 v15, 0x2000

    .line 605
    .line 606
    goto/16 :goto_2

    .line 607
    .line 608
    :cond_1d
    move-object/from16 v17, v4

    .line 609
    .line 610
    move/from16 v31, v7

    .line 611
    .line 612
    invoke-virtual {v10}, Landroid/util/SparseIntArray;->size()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    const/4 v7, 0x0

    .line 617
    :goto_f
    iget-object v1, v2, LY2/y;->h:Landroid/util/SparseArray;

    .line 618
    .line 619
    if-ge v7, v0, :cond_20

    .line 620
    .line 621
    invoke-virtual {v10, v7}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    invoke-virtual {v10, v7}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    const/4 v6, 0x1

    .line 630
    invoke-virtual {v12, v4, v6}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 631
    .line 632
    .line 633
    iget-object v8, v2, LY2/y;->j:Landroid/util/SparseBooleanArray;

    .line 634
    .line 635
    invoke-virtual {v8, v5, v6}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v3, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v6

    .line 642
    check-cast v6, LY2/A;

    .line 643
    .line 644
    if-eqz v6, :cond_1f

    .line 645
    .line 646
    iget-object v8, v2, LY2/y;->r:LY2/A;

    .line 647
    .line 648
    if-eq v6, v8, :cond_1e

    .line 649
    .line 650
    iget-object v8, v2, LY2/y;->m:Ls2/o;

    .line 651
    .line 652
    new-instance v9, LT5/B;

    .line 653
    .line 654
    const/4 v11, 0x1

    .line 655
    move/from16 v13, v31

    .line 656
    .line 657
    const/16 v15, 0x2000

    .line 658
    .line 659
    invoke-direct {v9, v13, v4, v15, v11}, LT5/B;-><init>(IIII)V

    .line 660
    .line 661
    .line 662
    move-object/from16 v4, v17

    .line 663
    .line 664
    invoke-interface {v6, v4, v8, v9}, LY2/A;->b(LQ1/u;Ls2/o;LT5/B;)V

    .line 665
    .line 666
    .line 667
    goto :goto_10

    .line 668
    :cond_1e
    move-object/from16 v4, v17

    .line 669
    .line 670
    move/from16 v13, v31

    .line 671
    .line 672
    const/16 v15, 0x2000

    .line 673
    .line 674
    :goto_10
    invoke-virtual {v1, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    goto :goto_11

    .line 678
    :cond_1f
    move-object/from16 v4, v17

    .line 679
    .line 680
    move/from16 v13, v31

    .line 681
    .line 682
    const/16 v15, 0x2000

    .line 683
    .line 684
    :goto_11
    add-int/lit8 v7, v7, 0x1

    .line 685
    .line 686
    move-object/from16 v17, v4

    .line 687
    .line 688
    move/from16 v31, v13

    .line 689
    .line 690
    goto :goto_f

    .line 691
    :cond_20
    const/4 v5, 0x2

    .line 692
    if-ne v14, v5, :cond_22

    .line 693
    .line 694
    iget-boolean v0, v2, LY2/y;->o:Z

    .line 695
    .line 696
    if-nez v0, :cond_21

    .line 697
    .line 698
    iget-object v0, v2, LY2/y;->m:Ls2/o;

    .line 699
    .line 700
    invoke-interface {v0}, Ls2/o;->l()V

    .line 701
    .line 702
    .line 703
    const/4 v7, 0x0

    .line 704
    iput v7, v2, LY2/y;->n:I

    .line 705
    .line 706
    const/4 v6, 0x1

    .line 707
    iput-boolean v6, v2, LY2/y;->o:Z

    .line 708
    .line 709
    return-void

    .line 710
    :cond_21
    move-object/from16 v0, p0

    .line 711
    .line 712
    goto :goto_13

    .line 713
    :cond_22
    move-object/from16 v0, p0

    .line 714
    .line 715
    const/4 v6, 0x1

    .line 716
    const/4 v7, 0x0

    .line 717
    iget v3, v0, LN2/j;->b:I

    .line 718
    .line 719
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 720
    .line 721
    .line 722
    if-ne v14, v6, :cond_23

    .line 723
    .line 724
    move v1, v7

    .line 725
    goto :goto_12

    .line 726
    :cond_23
    iget v1, v2, LY2/y;->n:I

    .line 727
    .line 728
    sub-int/2addr v1, v6

    .line 729
    :goto_12
    iput v1, v2, LY2/y;->n:I

    .line 730
    .line 731
    if-nez v1, :cond_24

    .line 732
    .line 733
    iget-object v1, v2, LY2/y;->m:Ls2/o;

    .line 734
    .line 735
    invoke-interface {v1}, Ls2/o;->l()V

    .line 736
    .line 737
    .line 738
    iput-boolean v6, v2, LY2/y;->o:Z

    .line 739
    .line 740
    :cond_24
    :goto_13
    return-void
.end method

.method public h(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget v0, p0, LN2/j;->b:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lu6/a;->f()V

    .line 11
    .line 12
    .line 13
    return p1
.end method

.method public i(Lo3/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Lo3/a;)V
    .locals 3

    .line 1
    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lo3/a;->K(Ljava/lang/String;)Landroid/database/Cursor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LN2/j;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LH5/a;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, LH5/a;->c(Lo3/a;)V

    .line 32
    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, p1}, LH5/a;->m(Lo3/a;)Lk3/p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-boolean v2, v1, Lk3/p;->b:Z

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "Pre-packaged database has an invalid schema: "

    .line 50
    .line 51
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v1, Lk3/p;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, LN2/j;->p(Lo3/a;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, LH5/a;->i(Lo3/a;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    :catchall_1
    move-exception v1

    .line 76
    invoke-static {v0, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public k(Lo3/a;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LN2/j;->m(Lo3/a;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public l(Lo3/a;)V
    .locals 5

    .line 1
    const-string v0, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lo3/a;->K(Ljava/lang/String;)Landroid/database/Cursor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LN2/j;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LH5/a;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    new-instance v1, LNe/a;

    .line 37
    .line 38
    const-string v4, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 39
    .line 40
    invoke-direct {v1, v4}, LNe/a;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v1}, Lo3/a;->t(Lo3/f;)Landroid/database/Cursor;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    goto :goto_1

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    move-object v2, v3

    .line 61
    :goto_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, LN2/j;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    iget-object v4, p0, LN2/j;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string v0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    .line 88
    .line 89
    const-string v3, ", found: "

    .line 90
    .line 91
    invoke-static {v0, v1, v3, v2}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 100
    :catchall_2
    move-exception v0

    .line 101
    invoke-static {v1, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_3
    invoke-virtual {v0, p1}, LH5/a;->m(Lo3/a;)Lk3/p;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-boolean v2, v1, Lk3/p;->b:Z

    .line 110
    .line 111
    if-eqz v2, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0, p1}, LN2/j;->p(Lo3/a;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_3
    invoke-virtual {v0, p1}, LH5/a;->j(Lo3/a;)V

    .line 117
    .line 118
    .line 119
    iput-object v3, p0, LN2/j;->c:Ljava/lang/Object;

    .line 120
    .line 121
    return-void

    .line 122
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v2, "Pre-packaged database has an invalid schema: "

    .line 127
    .line 128
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, v1, Lk3/p;->a:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :goto_4
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 145
    :catchall_3
    move-exception v1

    .line 146
    invoke-static {v0, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v1
.end method

.method public m(Lo3/a;II)V
    .locals 12

    .line 1
    iget-object v0, p0, LN2/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk3/c;

    .line 4
    .line 5
    iget-object v1, p0, LN2/j;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LH5/a;

    .line 8
    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    iget-object v0, v0, Lk3/c;->d:Lh4/m;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    if-ne p2, p3, :cond_0

    .line 17
    .line 18
    sget-object v0, Lff/v;->a:Lff/v;

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    const/4 v2, 0x1

    .line 23
    const/4 v3, 0x0

    .line 24
    if-le p3, p2, :cond_1

    .line 25
    .line 26
    move v4, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v4, v3

    .line 29
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    move v6, p2

    .line 35
    :cond_2
    if-eqz v4, :cond_3

    .line 36
    .line 37
    if-ge v6, p3, :cond_9

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    if-le v6, p3, :cond_9

    .line 41
    .line 42
    :goto_1
    iget-object v7, v0, Lh4/m;->a:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/util/TreeMap;

    .line 53
    .line 54
    if-nez v7, :cond_4

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :cond_4
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    invoke-virtual {v7}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    :goto_2
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_8

    .line 77
    .line 78
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    check-cast v9, Ljava/lang/Integer;

    .line 83
    .line 84
    const-string v10, "targetVersion"

    .line 85
    .line 86
    if-eqz v4, :cond_7

    .line 87
    .line 88
    add-int/lit8 v11, v6, 0x1

    .line 89
    .line 90
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-gt v11, v10, :cond_6

    .line 98
    .line 99
    if-gt v10, p3, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-gt p3, v10, :cond_6

    .line 110
    .line 111
    if-ge v10, v6, :cond_6

    .line 112
    .line 113
    :goto_3
    invoke-virtual {v7, v9}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    move v7, v2

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move v7, v3

    .line 130
    :goto_4
    if-nez v7, :cond_2

    .line 131
    .line 132
    :goto_5
    const/4 v0, 0x0

    .line 133
    goto :goto_6

    .line 134
    :cond_9
    move-object v0, v5

    .line 135
    :goto_6
    if-eqz v0, :cond_c

    .line 136
    .line 137
    invoke-virtual {v1, p1}, LH5/a;->l(Lo3/a;)V

    .line 138
    .line 139
    .line 140
    check-cast v0, Ljava/lang/Iterable;

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    if-eqz p3, :cond_a

    .line 151
    .line 152
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    check-cast p3, Ll3/a;

    .line 157
    .line 158
    invoke-virtual {p3, p1}, Ll3/a;->a(Lo3/a;)V

    .line 159
    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_a
    invoke-virtual {v1, p1}, LH5/a;->m(Lo3/a;)Lk3/p;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    iget-boolean p3, p2, Lk3/p;->b:Z

    .line 167
    .line 168
    if-eqz p3, :cond_b

    .line 169
    .line 170
    invoke-virtual {p0, p1}, LN2/j;->p(Lo3/a;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    new-instance p3, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v0, "Migration didn\'t properly handle: "

    .line 179
    .line 180
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-object p2, p2, Lk3/p;->a:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_c
    iget-object v0, p0, LN2/j;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lk3/c;

    .line 199
    .line 200
    if-eqz v0, :cond_10

    .line 201
    .line 202
    if-le p2, p3, :cond_d

    .line 203
    .line 204
    iget-boolean v2, v0, Lk3/c;->k:Z

    .line 205
    .line 206
    if-eqz v2, :cond_d

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_d
    iget-boolean v2, v0, Lk3/c;->j:Z

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    iget-object v0, v0, Lk3/c;->l:Ljava/util/LinkedHashSet;

    .line 214
    .line 215
    if-eqz v0, :cond_e

    .line 216
    .line 217
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_f

    .line 226
    .line 227
    :cond_e
    const/4 v0, 0x1

    .line 228
    goto :goto_9

    .line 229
    :cond_f
    :goto_8
    const/4 v0, 0x0

    .line 230
    :goto_9
    if-nez v0, :cond_10

    .line 231
    .line 232
    invoke-virtual {v1, p1}, LH5/a;->d(Lo3/a;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, p1}, LH5/a;->c(Lo3/a;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 240
    .line 241
    const-string v0, "A migration from "

    .line 242
    .line 243
    const-string v1, " to "

    .line 244
    .line 245
    const-string v2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    .line 246
    .line 247
    invoke-static {v0, p2, v1, p3, v2}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1
.end method

.method public o(LL8/a;)V
    .locals 8

    .line 1
    iget-object v0, p0, LN2/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lad/L;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lad/L;-><init>(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v3, 0x23

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    const/16 v5, 0x1e

    .line 25
    .line 26
    if-lt v1, v3, :cond_0

    .line 27
    .line 28
    new-instance v1, Lk1/y0;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v1, v0, v2, v3}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-lt v1, v5, :cond_1

    .line 36
    .line 37
    new-instance v1, Lk1/w0;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-direct {v1, v0, v2, v3}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-lt v1, v4, :cond_2

    .line 45
    .line 46
    new-instance v1, Lk1/x0;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, v0, v2, v3}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v1, Lk1/w0;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-direct {v1, v0, v2, v3}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    if-ge v2, v5, :cond_3

    .line 62
    .line 63
    const/high16 v3, -0x80000000

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 66
    .line 67
    .line 68
    const/high16 v3, 0xc000000

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget v3, p1, LL8/a;->b:I

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x1

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-static {v3}, LA/f;->f(I)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    if-eq v3, v6, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {v1, v6}, Lcom/moloco/sdk/internal/publisher/H;->r0(Z)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    invoke-virtual {v1, v5}, Lcom/moloco/sdk/internal/publisher/H;->r0(Z)V

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_1
    iget-object v3, p1, LL8/a;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Ljava/lang/Integer;

    .line 98
    .line 99
    if-eqz v3, :cond_7

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 106
    .line 107
    .line 108
    :cond_7
    iget-object v3, p1, LL8/a;->d:Ljava/io/Serializable;

    .line 109
    .line 110
    check-cast v3, Ljava/lang/Boolean;

    .line 111
    .line 112
    const/16 v7, 0x1d

    .line 113
    .line 114
    if-eqz v3, :cond_8

    .line 115
    .line 116
    if-lt v2, v7, :cond_8

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {v0, v3}, Le0/a;->p(Landroid/view/Window;Z)V

    .line 123
    .line 124
    .line 125
    :cond_8
    if-lt v2, v4, :cond_c

    .line 126
    .line 127
    iget v3, p1, LL8/a;->c:I

    .line 128
    .line 129
    if-eqz v3, :cond_b

    .line 130
    .line 131
    invoke-static {v3}, LA/f;->f(I)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_a

    .line 136
    .line 137
    if-eq v3, v6, :cond_9

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_9
    invoke-virtual {v1, v6}, Lcom/moloco/sdk/internal/publisher/H;->q0(Z)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_a
    invoke-virtual {v1, v5}, Lcom/moloco/sdk/internal/publisher/H;->q0(Z)V

    .line 145
    .line 146
    .line 147
    :cond_b
    :goto_2
    iget-object v1, p1, LL8/a;->e:Ljava/io/Serializable;

    .line 148
    .line 149
    check-cast v1, Ljava/lang/Integer;

    .line 150
    .line 151
    if-eqz v1, :cond_c

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 158
    .line 159
    .line 160
    :cond_c
    iget-object v1, p1, LL8/a;->f:Ljava/io/Serializable;

    .line 161
    .line 162
    check-cast v1, Ljava/lang/Integer;

    .line 163
    .line 164
    if-eqz v1, :cond_d

    .line 165
    .line 166
    const/16 v3, 0x1c

    .line 167
    .line 168
    if-lt v2, v3, :cond_d

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-static {v0, v1}, Ldb/b;->t(Landroid/view/Window;I)V

    .line 175
    .line 176
    .line 177
    :cond_d
    iget-object v1, p1, LL8/a;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ljava/lang/Boolean;

    .line 180
    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    if-lt v2, v7, :cond_e

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-static {v0, v1}, Le0/a;->v(Landroid/view/Window;Z)V

    .line 190
    .line 191
    .line 192
    :cond_e
    iput-object p1, p0, LN2/j;->e:Ljava/lang/Object;

    .line 193
    .line 194
    return-void
.end method

.method public p(Lo3/a;)V
    .locals 3

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN2/j;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v0, "\')"

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, LN2/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, LN2/j;->b:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LN2/j;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LL8/a;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v0}, LN2/j;->o(LL8/a;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
