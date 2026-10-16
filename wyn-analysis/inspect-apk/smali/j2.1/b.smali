.class public final Lj2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:[LN1/n;

.field public final k:I

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/util/ArrayList;

.field public final o:[J

.field public final p:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;IIIILjava/lang/String;[LN1/n;Ljava/util/ArrayList;[JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj2/b;->l:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lj2/b;->m:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lj2/b;->a:I

    .line 9
    .line 10
    iput-object p4, p0, Lj2/b;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p5, p0, Lj2/b;->c:J

    .line 13
    .line 14
    iput-object p7, p0, Lj2/b;->d:Ljava/lang/String;

    .line 15
    .line 16
    iput p8, p0, Lj2/b;->e:I

    .line 17
    .line 18
    iput p9, p0, Lj2/b;->f:I

    .line 19
    .line 20
    iput p10, p0, Lj2/b;->g:I

    .line 21
    .line 22
    iput p11, p0, Lj2/b;->h:I

    .line 23
    .line 24
    iput-object p12, p0, Lj2/b;->i:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p13, p0, Lj2/b;->j:[LN1/n;

    .line 27
    .line 28
    iput-object p14, p0, Lj2/b;->n:Ljava/util/ArrayList;

    .line 29
    .line 30
    iput-object p15, p0, Lj2/b;->o:[J

    .line 31
    .line 32
    move-wide/from16 p2, p16

    .line 33
    .line 34
    iput-wide p2, p0, Lj2/b;->p:J

    .line 35
    .line 36
    invoke-virtual {p14}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lj2/b;->k:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a([LN1/n;)Lj2/b;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj2/b;

    .line 4
    .line 5
    iget-object v2, v0, Lj2/b;->o:[J

    .line 6
    .line 7
    iget-object v15, v0, Lj2/b;->n:Ljava/util/ArrayList;

    .line 8
    .line 9
    move-object/from16 v16, v2

    .line 10
    .line 11
    iget-object v2, v0, Lj2/b;->l:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v0, Lj2/b;->m:Ljava/lang/String;

    .line 14
    .line 15
    iget v4, v0, Lj2/b;->a:I

    .line 16
    .line 17
    iget-object v5, v0, Lj2/b;->b:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v6, v0, Lj2/b;->c:J

    .line 20
    .line 21
    iget-object v8, v0, Lj2/b;->d:Ljava/lang/String;

    .line 22
    .line 23
    iget v9, v0, Lj2/b;->e:I

    .line 24
    .line 25
    iget v10, v0, Lj2/b;->f:I

    .line 26
    .line 27
    iget v11, v0, Lj2/b;->g:I

    .line 28
    .line 29
    iget v12, v0, Lj2/b;->h:I

    .line 30
    .line 31
    iget-object v13, v0, Lj2/b;->i:Ljava/lang/String;

    .line 32
    .line 33
    move-object v14, v1

    .line 34
    move-object/from16 v17, v2

    .line 35
    .line 36
    iget-wide v1, v0, Lj2/b;->p:J

    .line 37
    .line 38
    move-wide/from16 v19, v1

    .line 39
    .line 40
    move-object/from16 v2, v17

    .line 41
    .line 42
    move-wide/from16 v17, v19

    .line 43
    .line 44
    move-object v1, v14

    .line 45
    move-object/from16 v14, p1

    .line 46
    .line 47
    invoke-direct/range {v1 .. v18}, Lj2/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;IIIILjava/lang/String;[LN1/n;Ljava/util/ArrayList;[JJ)V

    .line 48
    .line 49
    .line 50
    move-object v14, v1

    .line 51
    return-object v14
.end method

.method public final b(I)J
    .locals 4

    .line 1
    iget v0, p0, Lj2/b;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lj2/b;->p:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 11
    .line 12
    iget-object v1, p0, Lj2/b;->o:[J

    .line 13
    .line 14
    aget-wide v2, v1, v0

    .line 15
    .line 16
    aget-wide v0, v1, p1

    .line 17
    .line 18
    sub-long/2addr v2, v0

    .line 19
    return-wide v2
.end method
